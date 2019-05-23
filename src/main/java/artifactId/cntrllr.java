package artifactId;

import artifactId.domain.Items;
import artifactId.repos.ItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class cntrllr {

    @Autowired
    private ItemsRepo itemsRepo;

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<Items> items = itemsRepo.findAll();

        model.put("items", items);

        return "main";
    }

/*    @PostMapping
    public String add(@RequestParam String Name, @RequestParam String Shelf, @RequestParam String Box, Map<String, Object> model) {
        Items item = new Items(Name, Shelf, Box);

        itemsRepo.save(item);

        Iterable<Items> items = itemsRepo.findAll();

        model.put("items", items);

        return "main";
    }*/
}
