package expression;

import java.util.ArrayList;
import java.util.List;
import antlr.EOlangBaseVisitor;
import antlr.EOlangParser.AbstractExprContext;
import antlr.EOlangParser.Compound_stmtContext;
import antlr.EOlangParser.NamingExprContext;
import antlr.EOlangParser.ObjectContext;
import antlr.EOlangParser.ObjectExprContext;
import antlr.EOlangParser.ObjectListContext;
import antlr.EOlangParser.ParensExprContext;
import antlr.EOlangParser.Simple_stmtContext;
import antlr.EOlangParser.StmtContext;
import antlr.EOlangParser.SuiteContext;

public class AntlrToExpression extends EOlangBaseVisitor<Expression> {

	@Override
	public Expression visitStmt(StmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStmt(ctx);
	}

	@Override
	public Expression visitSimple_stmt(Simple_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSimple_stmt(ctx);
	}

	@Override
	public Expression visitCompound_stmt(Compound_stmtContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCompound_stmt(ctx);
	}

	@Override
	public Expression visitSuite(SuiteContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSuite(ctx);
	}

	@Override
	public Expression visitNamingExpr(NamingExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNamingExpr(ctx);
	}

	@Override
	public Expression visitAbstractExpr(AbstractExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAbstractExpr(ctx);
	}

	@Override
	public Expression visitParensExpr(ParensExprContext ctx) {
		
		// TODO Auto-generated method stub
		return super.visitParensExpr(ctx);
	}

	@Override
	public Expression visitObjectList(ObjectListContext ctx) {
		List<Object> objects = new ArrayList<Object>();
		int n = ctx.Size();
		String a = ctx.ObjectList().getText();
		for (int i = 1; i < (n - 1); i++) {
			objects.add(ctx.getChild(i)).getText();
		}
		return new ObjectList(objects);
	}

	@Override
	public Expression visitObject(ObjectContext ctx) {
		String object = ctx.getChild(0).getText();
		return new Object(object);
	}
        
}
