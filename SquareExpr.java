package expression;

public class SquareExpr extends Expression {
    Expression expr;
    
    public SquareExpr(Expression expr) {
    	this.expr = expr;
    }
    
    @Override
    public String toString() {
    	return "(" + expr.toString() + ")";
    }
}
