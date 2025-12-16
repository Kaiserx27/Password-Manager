@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/mfa")
    public String mfa(@RequestParam String code) {
        // weryfikacja MFA
        return "redirect:/vault";
    }
}
