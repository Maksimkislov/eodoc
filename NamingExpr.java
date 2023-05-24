package expression;

public class NamingExpr extends Expression {
    public Expression expr;
    public String object;
    
    public NamingExpr(Expression expr, String object) {
    	this.expr = expr;
    	this.object = object;
    }
}
