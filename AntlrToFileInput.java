package expression;

import antlr.EOlangBaseVisitor;
import antlr.EOlangParser.File_inputContext;

public class AntlrToFileInput extends EOlangBaseVisitor<Program> {

	@Override
	public Program visitFile_input(File_inputContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFile_input(ctx);
	}
    
}
