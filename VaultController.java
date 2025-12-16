@Controller
@RequestMapping("/vault")
public class VaultController {

    @GetMapping
    public String vault(Model model) {
        model.addAttribute("passwords", List.of());
        return "vault";
    }
}
