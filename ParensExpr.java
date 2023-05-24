package expression;

public class ParensExpr extends Expression {
    Expression expr;
    
    public ParensExpr(Expression expr) {
    	this.expr = expr;
    }
    
    @Override
    public String toString() {
    	return "(" + expr.toString() + ")";
    }
}
