package com.ironyard.jpapractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static javax.measure.unit.SI.KILOGRAM;
import javax.measure.quantity.Mass;
import org.jscience.physics.model.RelativisticModel;import java.util.ArrayList;
import org.jscience.physics.amount.Amount;import java.util.List;
import java.util.Map;

@RestController
public class TableNameRestController {

    @Autowired
    TableNameRepository tableNameRepo;

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/number")
    public Integer number() {
        return 2;
    }

    @GetMapping("/bolean")
    public Boolean hi() {
        return true;
    }

    @GetMapping("/list")
    public ArrayList<String> list() {
        ArrayList<String> table = new ArrayList<>();
        table.add("hello");
        table.add("aeurgeur");
        return table;

    }

    @GetMapping("/words")
    public TableName tableName(){
        TableName table = new TableName();
        table.setId(2);
        table.setName("yigy");

        return table;
    }

    @GetMapping("/listTableNames")
    public List<TableName> tableNameList(){

        return tableNameRepo.findAll();
    }

    @RequestMapping("/hello")
    String hello(Map<String, Object> model) {
        RelativisticModel.select();
        Amount<Mass> m = Amount.valueOf("12 GeV").to(KILOGRAM);
        model.put("science", "E=mc^2: 12 GeV = " + m.toString());
        return "hello";
    }
}
