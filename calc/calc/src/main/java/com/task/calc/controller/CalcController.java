package com.task.calc.controller;
import com.task.calc.entity.Calculator;
import com.task.calc.repo.CalcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class CalcController {
    @Autowired
    CalcRepository calcRepository;

    @ResponseBody
    @RequestMapping("/calc")
    public int Calc(@RequestBody Calculator calc) {

        String operator = calc.getOperator();
        int inp1 = calc.getInp1();
        int inp2 = calc.getInp2();
        int result = calc.getResult();
        if (operator.equals("+")) {
            result = inp1 + inp2;
        }
        if (operator.equals("-")) {
            result = inp1 - inp2;
        }
        if (operator.equals("/")) {
            result = inp1 / inp2;
        }
        if (operator.equals("*")) {
            result = inp1 * inp2;
        }
        Calculator calcu = new Calculator(inp1, inp2, operator, result);
        calcRepository.save(calcu);
        return result;
    }
}









