package Java.AST.Expr.SQLexprConstrint;

public class K_MATCH extends sqlExprtion {
    @Override
    public String toString() {
        return "K_MATCH{" +
                ((left != null) ? ("Left ='" + left.toString()) : "") + '\t' +
                ((right != null) ? ("right='" + right.toString()) : "") + '\t' +
                '}';
    }
}
