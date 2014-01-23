Expression Evaluator
======

Evaluates the given Expressions...

### How to Install
    1. Extract zip folder (will have different name for different versions, eg. evaluator-0.1)
    2. Set the Environment Variable `EVALUATOR_HOME`
        Set the path of your folder in this Variable
    3. Use Shell file to run the expression evaluator.

### Running Process
     Give - sh kajExpressionEvaluator.sh [Expression]
     Example - sh kajExpressionEvaluator.sh "1 + 2"
     
### Release Notes for Version 0.3
    1. Accepts Positive and Negative numbers.
    2. Only Integer values should be given.
    3. Accepts Multiple Operands and Operators.
    4. Can have Operators such as :- "+ - * / ^"
    5. Brackets are allowed.
    6. Space is must between operands, operators and brackets.
    7. Handles 22 / 3
    8. HAndles 22
    
    Ex. "1 + ( 2 + 3 )" = 6
        "1 + ( 2 * 3 ) + ( 6 - 2 )" = 11

### Release Notes for Version 0.2
    1. Accepts Positive and Negative numbers.
    2. Only Integer values should be given.
    3. Accepts Multiple Operands and Operators.
    4. Can have Operators such as :- "+ - * / ^"
    5. No Brackets are allowed.
    6. Space is must between operands and operators.
    
    Ex. "1 + 2 + 3" = 6
        "1 * 2 + 3" = 5
        "10 + 5 / 3" = 5
        "1 + 2 * 3 - 4 / 5 ^ -6" = 1

### Release Notes for Version 0.1
    1. Accepts Positive and Negative numbers.
    2. Only Integer values should be given.
    3. Two Operands and One Operator is needed.
    4. Space is must between operands and operators.
    5. Can have Operators such as :-  "+ - * / ^"
    6. No Brackets are allowed.

    Ex. "1 + 2" = 3
