package spring.cloud.deep.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @RequestMapping("/hi")
    public String home(@RequestParam (required = false,defaultValue = "forezp") String name) {
        return ribbonService.hi(name) ;
    }
}
