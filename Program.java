package expression;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Expression> expressions;
    
    public Program() {
    	this.expressions = new ArrayList<>();
    }
    
    public void addExpession(Expression e) {
    	expressions.add(e);
    }
}
