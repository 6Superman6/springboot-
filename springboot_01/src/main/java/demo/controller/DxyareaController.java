package demo.controller;

import demo.service.DxyareaService;
import demo.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DxyareaController {

    @Autowired
    private DxyareaService dxyareaService;

    @RequestMapping("/do/{id}")
    public ServerResponse find(@PathVariable Integer id)
    {
        return dxyareaService.get(id);
    }

    @GetMapping("/hel")
    public String hello()
    {
        return "index";
    }

}
