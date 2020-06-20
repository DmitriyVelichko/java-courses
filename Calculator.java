public class Calculator {

    private int result = 0;

    //Сложение
    public void add(int... params) {
        for(Integer param: params){
            this.result += param;
        }
    }

    //Вычитание
    public void sub(int... params) {
        for(Integer param: params){
            this.result -= param;
        }
    }

    //Умножение
    public void mul(int... params) {
        this.result = params[0] * params[1];
    }

    //Деление
    public void div(int... params) {
        this.result = params[0] / params[1];
    }

    public int getResult(){
        return this.result;
    }

    public void cleanResult(){
        this.result = 0;
    }
}
