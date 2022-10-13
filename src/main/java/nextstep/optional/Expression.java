package nextstep.optional;

import java.util.Arrays;
import java.util.Optional;

enum Expression {
    PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/");

    private String expression;

    Expression(String expression) {
        this.expression = expression;
    }

    private static boolean matchExpression(Expression e, String expression) {
        return expression.equals(e.expression);
    }

//    static Expression of(String expression) {
//        for (Expression v : values()) {
////            System.out.println(v.name());
//            if (matchExpression(v, expression)) {
//                return v;
//            }
//        }
//
//        throw new IllegalArgumentException(String.format("%s는 사칙연산에 해당하지 않는 표현식입니다.", expression));
//    }

    static Expression of(String expression) {
        return Arrays.stream(values()).
                filter(x -> matchExpression(x, expression)).
                findAny().
                orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산자를 입력해주세요."));
    }
}
