package CS2.luisherrera.app.infrastructure.security;

import CS2.luisherrera.app.domain.model.User;
import CS2.luisherrera.app.domain.model.auth.JwtUtil;
import CS2.luisherrera.infrastructure.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * Servicio que carga los detalles del usuario desde la base de datos
 * y genera el token JWT al iniciar sesión correctamente.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Busca el usuario en la base de datos
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + username));

        // Retorna un UserDetails que Spring Security entiende
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                Collections.emptyList()
        );
    }

    /**
     * Genera un token JWT para el usuario autenticado.
     */
    public String generateTokenForUser(String username) {
        return jwtUtil.generateToken(username);
    }
}
