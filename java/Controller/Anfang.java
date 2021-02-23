package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Anfang {


    @GetMapping("/start/")
    public String coolerStart(Model model){

        return "main/start";
    }

}
