package xyz.typing365;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class VisitCountController {

    @Autowired
    public VisitCounterRepository customerRepository;

    private VisitCount visitCount = new VisitCount();

    @CrossOrigin("*")
    @RequestMapping(value = "/visitCount", method = GET)
    public HashMap<String, Object> visitCount() {
        long lCount = visitCount.getCounter(customerRepository);

        HashMap<String, Object> mapResult = new HashMap<>();
        mapResult.put("visitCount", lCount);
        return mapResult;
    }
}