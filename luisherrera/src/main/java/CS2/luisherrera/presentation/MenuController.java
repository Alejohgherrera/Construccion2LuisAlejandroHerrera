/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.presentation.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Simulación de las dependencias que faltan para que el código sea autocontenido
// En una aplicación real, estas clases estarían en sus propias capas.
class Menu {
    private Long id;
    private String name;
    private String description;

    public Menu() {}
    public Menu(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}

class MenuService {
    // Simulación de una base de datos en memoria para el ejemplo
    private final List<Menu> menus = new ArrayList<>();
    private Long nextId = 1L;

    public MenuService() {
        menus.add(new Menu(nextId++, "Menú del Día", "Una deliciosa combinación de platos de temporada."));
        menus.add(new Menu(nextId++, "Menú Vegetariano", "Opciones frescas y saludables para vegetarianos."));
    }

    public Menu saveMenu(Menu menu) {
        if (menu.getId() == null) {
            menu.setId(nextId++);
        }
        menus.add(menu);
        return menu;
    }

    public Optional<Menu> findById(Long id) {
        return menus.stream().filter(m -> m.getId().equals(id)).findFirst();
    }

    public List<Menu> findAllMenus() {
        return new ArrayList<>(menus);
    }

    public void deleteMenu(Long id) {
        menus.removeIf(m -> m.getId().equals(id));
    }
}

/**
 * Controlador REST para manejar las peticiones relacionadas con los menús.
 * Esta clase forma parte de la capa de presentación y se comunica con el servicio de dominio.
 * Para que este ejemplo sea ejecutable, las clases de modelo y servicio se simulan internamente.
 */
@RestController
@RequestMapping("/api/menus")
public class MenuController {

    private final MenuService menuService;

    public MenuController() {
        // Inicializa el servicio simulado
        this.menuService = new MenuService();
    }

    /**
     * Endpoint para crear un nuevo menú.
     * POST /api/menus
     * @param menu El objeto de menú a guardar.
     * @return El menú guardado con su ID.
     */
    @PostMapping
    public ResponseEntity<Menu> saveMenu(@RequestBody Menu menu) {
        Menu savedMenu = menuService.saveMenu(menu);
        return new ResponseEntity<>(savedMenu, HttpStatus.CREATED);
    }

    /**
     * Endpoint para buscar un menú por su ID.
     * GET /api/menus/{id}
     * @param id El ID del menú.
     * @return El menú si se encuentra, o un 404 Not Found si no existe.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Menu> findById(@PathVariable Long id) {
        Optional<Menu> menu = menuService.findById(id);
        return menu.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Endpoint para obtener todos los menús.
     * GET /api/menus
     * @return Una lista de todos los menús.
     */
    @GetMapping
    public ResponseEntity<List<Menu>> findAllMenus() {
        List<Menu> menus = menuService.findAllMenus();
        return ResponseEntity.ok(menus);
    }

    /**
     * Endpoint para eliminar un menú por su ID.
     * DELETE /api/menus/{id}
     * @param id El ID del menú a eliminar.
     * @return Una respuesta 204 No Content si se elimina con éxito.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenu(@PathVariable Long id) {
        menuService.deleteMenu(id);
        return ResponseEntity.noContent().build();
    }
}
