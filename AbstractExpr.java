package expression;

public class AbstractExpr extends Expression {
    public Expression expr;
    public String object;
    
    public AbstractExpr(Expression expr, String object) {
    	this.expr = expr;
    	this.object = object;
    }
    
}
