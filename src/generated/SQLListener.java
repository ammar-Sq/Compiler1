// Generated from C:/Users/Eng Alaa Alkheder/IdeaProjects/Compiler\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SQLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#stat_forloop}.
	 * @param ctx the parse tree
	 */
	void enterStat_forloop(SQLParser.Stat_forloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#stat_forloop}.
	 * @param ctx the parse tree
	 */
	void exitStat_forloop(SQLParser.Stat_forloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#json_st}.
	 * @param ctx the parse tree
	 */
	void enterJson_st(SQLParser.Json_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#json_st}.
	 * @param ctx the parse tree
	 */
	void exitJson_st(SQLParser.Json_stContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#json_atmt}.
	 * @param ctx the parse tree
	 */
	void enterJson_atmt(SQLParser.Json_atmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#json_atmt}.
	 * @param ctx the parse tree
	 */
	void exitJson_atmt(SQLParser.Json_atmtContext ctx);
	/**
     * Enter a parse tree produced by {@link SQLParser#higer_order_function_stmt_head}.
     * @param ctx the parse tree
     */
    void enterHiger_order_function_stmt_head(SQLParser.Higer_order_function_stmt_headContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#higer_order_function_stmt_head}.
     *
     * @param ctx the parse tree
     */
    void exitHiger_order_function_stmt_head(SQLParser.Higer_order_function_stmt_headContext ctx);

    /**
	 * Enter a parse tree produced by {@link SQLParser#higer_order_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterHiger_order_function_stmt(SQLParser.Higer_order_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#higer_order_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitHiger_order_function_stmt(SQLParser.Higer_order_function_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#x}.
     *
     * @param ctx the parse tree
     */
    void enterX(SQLParser.XContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#x}.
     *
     * @param ctx the parse tree
     */
    void exitX(SQLParser.XContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterArr_stmt(SQLParser.Arr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitArr_stmt(SQLParser.Arr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#var_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVar_stmt(SQLParser.Var_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#var_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVar_stmt(SQLParser.Var_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#var_body}.
     * @param ctx the parse tree
     */
    void enterVar_body(SQLParser.Var_bodyContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#var_body}.
     * @param ctx the parse tree
     */
    void exitVar_body(SQLParser.Var_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(SQLParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(SQLParser.Print_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#call_array}.
     *
     * @param ctx the parse tree
     */
    void enterCall_array(SQLParser.Call_arrayContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#call_array}.
     *
     * @param ctx the parse tree
     */
    void exitCall_array(SQLParser.Call_arrayContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#call_json}.
     *
     * @param ctx the parse tree
     */
    void enterCall_json(SQLParser.Call_jsonContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#call_json}.
     *
     * @param ctx the parse tree
     */
    void exitCall_json(SQLParser.Call_jsonContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#print_body}.
     *
     * @param ctx the parse tree
     */
    void enterPrint_body(SQLParser.Print_bodyContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#print_body}.
     *
     * @param ctx the parse tree
     */
    void exitPrint_body(SQLParser.Print_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_head}.
	 * @param ctx the parse tree
	 */
	void enterFunction_head(SQLParser.Function_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_head}.
	 * @param ctx the parse tree
	 */
	void exitFunction_head(SQLParser.Function_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(SQLParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(SQLParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stmt(SQLParser.Function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stmt(SQLParser.Function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_stmt(SQLParser.Function_call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_stmt(SQLParser.Function_call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#params_stmt}.
	 * @param ctx the parse tree
	 */
	void enterParams_stmt(SQLParser.Params_stmtContext ctx);
	/**
     * Exit a parse tree produced by {@link SQLParser#params_stmt}.
     * @param ctx the parse tree
     */
    void exitParams_stmt(SQLParser.Params_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#arguments_body_defult_paremeter}.
     *
     * @param ctx the parse tree
     */
    void enterArguments_body_defult_paremeter(SQLParser.Arguments_body_defult_paremeterContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#arguments_body_defult_paremeter}.
     *
     * @param ctx the parse tree
     */
    void exitArguments_body_defult_paremeter(SQLParser.Arguments_body_defult_paremeterContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#arguments_body}.
     *
     * @param ctx the parse tree
     */
    void enterArguments_body(SQLParser.Arguments_bodyContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#arguments_body}.
	 * @param ctx the parse tree
	 */
	void exitArguments_body(SQLParser.Arguments_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arguments_stmt}.
	 * @param ctx the parse tree
	 */
	void enterArguments_stmt(SQLParser.Arguments_stmtContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#arguments_stmt}.
     *
     * @param ctx the parse tree
     */
    void exitArguments_stmt(SQLParser.Arguments_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#loop_Bady}.
     *
     * @param ctx the parse tree
     */
    void enterLoop_Bady(SQLParser.Loop_BadyContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#loop_Bady}.
     *
     * @param ctx the parse tree
     */
    void exitLoop_Bady(SQLParser.Loop_BadyContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#increment}.
     *
     * @param ctx the parse tree
     */
    void enterIncrement(SQLParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(SQLParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(SQLParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(SQLParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#do_while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_stmt(SQLParser.Do_while_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#do_while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_stmt(SQLParser.Do_while_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(SQLParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(SQLParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#condition_block}.
	 * @param ctx the parse tree
     */
    void enterCondition_block(SQLParser.Condition_blockContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#condition_block}.
     *
     * @param ctx the parse tree
     */
    void exitCondition_block(SQLParser.Condition_blockContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#if_body}.
     *
     * @param ctx the parse tree
     */
    void enterIf_body(SQLParser.If_bodyContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#if_body}.
     * @param ctx the parse tree
	 */
	void exitIf_body(SQLParser.If_bodyContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#if_else_if}.
     *
     * @param ctx the parse tree
     */
    void enterIf_else_if(SQLParser.If_else_ifContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#if_else_if}.
     *
     * @param ctx the parse tree
     */
    void exitIf_else_if(SQLParser.If_else_ifContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(SQLParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(SQLParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(SQLParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(SQLParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_stmt_short}.
     * @param ctx the parse tree
	 */
	void enterIf_stmt_short(SQLParser.If_stmt_shortContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#if_stmt_short}.
     * @param ctx the parse tree
     */
    void exitIf_stmt_short(SQLParser.If_stmt_shortContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#if_stmt_short_head}.
     * @param ctx the parse tree
     */
    void enterIf_stmt_short_head(SQLParser.If_stmt_short_headContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#if_stmt_short_head}.
     * @param ctx the parse tree
     */
    void exitIf_stmt_short_head(SQLParser.If_stmt_short_headContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#if_stmt_short_body}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt_short_body(SQLParser.If_stmt_short_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_stmt_short_body}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt_short_body(SQLParser.If_stmt_short_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#switch_stmt}.
     * @param ctx the parse tree
	 */
	void enterSwitch_stmt(SQLParser.Switch_stmtContext ctx);
	/**
     * Exit a parse tree produced by {@link SQLParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
    void exitSwitch_stmt(SQLParser.Switch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCase_stmt(SQLParser.Case_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCase_stmt(SQLParser.Case_stmtContext ctx);
	/**
     * Enter a parse tree produced by {@link SQLParser#return_stmt}.
     * @param ctx the parse tree
     */
    void enterReturn_stmt(SQLParser.Return_stmtContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#return_stmt}.
     *
     * @param ctx the parse tree
     */
    void exitReturn_stmt(SQLParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array1}.
	 * @param ctx the parse tree
	 */
	void enterArray1(SQLParser.Array1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array1}.
	 * @param ctx the parse tree
	 */
	void exitArray1(SQLParser.Array1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#one_line_instruction}.
	 * @param ctx the parse tree
	 */
	void enterOne_line_instruction(SQLParser.One_line_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#one_line_instruction}.
	 * @param ctx the parse tree
	 */
	void exitOne_line_instruction(SQLParser.One_line_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#math_op0}.
	 * @param ctx the parse tree
	 */
	void enterMath_op0(SQLParser.Math_op0Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#math_op0}.
	 * @param ctx the parse tree
	 */
	void exitMath_op0(SQLParser.Math_op0Context ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#identifier}.
	 * @param ctx the parse tree
     */
    void enterIdentifier(SQLParser.IdentifierContext ctx);

    /**
	 * Exit a parse tree produced by {@link SQLParser#identifier}.
     * @param ctx the parse tree
	 */
	void exitIdentifier(SQLParser.IdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#math_expr_Add_one}.
     * @param ctx the parse tree
     */
    void enterMath_expr_Add_one(SQLParser.Math_expr_Add_oneContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#math_expr_Add_one}.
     * @param ctx the parse tree
     */
    void exitMath_expr_Add_one(SQLParser.Math_expr_Add_oneContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#math_expr_Add_one_increment}.
	 * @param ctx the parse tree
     */
    void enterMath_expr_Add_one_increment(SQLParser.Math_expr_Add_one_incrementContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#math_expr_Add_one_increment}.
     * @param ctx the parse tree
     */
    void exitMath_expr_Add_one_increment(SQLParser.Math_expr_Add_one_incrementContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#math_expr_Add_one_dencrement}.
     * @param ctx the parse tree
	 */
	void enterMath_expr_Add_one_dencrement(SQLParser.Math_expr_Add_one_dencrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#math_expr_Add_one_dencrement}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr_Add_one_dencrement(SQLParser.Math_expr_Add_one_dencrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
     * Enter a parse tree produced by {@link SQLParser#select_or_values}.
     * @param ctx the parse tree
     */
    void enterSelect_or_values(SQLParser.Select_or_valuesContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#select_or_values}.
     *
     * @param ctx the parse tree
     */
    void exitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(SQLParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(SQLParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SQLParser.Column_defContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#type_name}.
     *
     * @param ctx the parse tree
     */
    void enterType_name(SQLParser.Type_nameContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#type_name}.
     *
     * @param ctx the parse tree
     */
    void exitType_name(SQLParser.Type_nameContext ctx);

    /**
	 * Enter a parse tree produced by {@link SQLParser#type_name_value}.
	 * @param ctx the parse tree
	 */
	void enterType_name_value(SQLParser.Type_name_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_name_value}.
	 * @param ctx the parse tree
	 */
	void exitType_name_value(SQLParser.Type_name_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(SQLParser.Column_defaultContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#column_default_value}.
     *
     * @param ctx the parse tree
     */
    void enterColumn_default_value(SQLParser.Column_default_valueContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#column_default_value}.
     *
     * @param ctx the parse tree
     */
    void exitColumn_default_value(SQLParser.Column_default_valueContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#array_json}.
     *
     * @param ctx the parse tree
     */
    void enterArray_json(SQLParser.Array_jsonContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#array_json}.
     *
     * @param ctx the parse tree
     */
    void exitArray_json(SQLParser.Array_jsonContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#expr_condition}.
     *
     * @param ctx the parse tree
     */
    void enterExpr_condition(SQLParser.Expr_conditionContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#expr_condition}.
     *
     * @param ctx the parse tree
     */
    void exitExpr_condition(SQLParser.Expr_conditionContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#math_expr_EQ}.
     *
     * @param ctx the parse tree
     */
    void enterMath_expr_EQ(SQLParser.Math_expr_EQContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#math_expr_EQ}.
     *
     * @param ctx the parse tree
     */
    void exitMath_expr_EQ(SQLParser.Math_expr_EQContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#math_expr}.
     *
     * @param ctx the parse tree
     */
    void enterMath_expr(SQLParser.Math_exprContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#math_expr}.
     *
     * @param ctx the parse tree
     */
    void exitMath_expr(SQLParser.Math_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#math_expr_logic}.
	 * @param ctx the parse tree
     */
    void enterMath_expr_logic(SQLParser.Math_expr_logicContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#math_expr_logic}.
     *
     * @param ctx the parse tree
     */
    void exitMath_expr_logic(SQLParser.Math_expr_logicContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterExpr(SQLParser.ExprContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_key_clause_value}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause_value(SQLParser.Foreign_key_clause_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_key_clause_value}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause_value(SQLParser.Foreign_key_clause_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
     */
    void enterJoin_constraint(SQLParser.Join_constraintContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#join_constraint}.
     *
     * @param ctx the parse tree
     */
    void exitJoin_constraint(SQLParser.Join_constraintContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#select_core}.
     *
     * @param ctx the parse tree
     */
    void enterSelect_core(SQLParser.Select_coreContext ctx);

    /**
     * Exit a parse tree produced by {@link SQLParser#select_core}.
     *
     * @param ctx the parse tree
     */
    void exitSelect_core(SQLParser.Select_coreContext ctx);

    /**
     * Enter a parse tree produced by {@link SQLParser#group_expr}.
     *
     * @param ctx the parse tree
     */
    void enterGroup_expr(SQLParser.Group_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#group_expr}.
	 * @param ctx the parse tree
	 */
	void exitGroup_expr(SQLParser.Group_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#values_selectCore}.
	 * @param ctx the parse tree
	 */
	void enterValues_selectCore(SQLParser.Values_selectCoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#values_selectCore}.
	 * @param ctx the parse tree
	 */
	void exitValues_selectCore(SQLParser.Values_selectCoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(SQLParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(SQLParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SQLParser.Any_nameContext ctx);
}