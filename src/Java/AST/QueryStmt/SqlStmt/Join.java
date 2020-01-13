/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package Java.AST.QueryStmt.SqlStmt;

import Java.AST.Expr.Expretion;
import Java.AST.Node;

import java.util.List;

public class Join extends Node {

    private boolean outer = false;
    private boolean left = false;
    private boolean inner = false;
//    private FromItem rightItem;
private Expretion onExpression;

}
