package enums;
enum Season{
    WINTER(-23),SPRING(20),SUMMER(100),FALL(70);
    private final int temp;

    Season(int temp) {
        this.temp = temp;
    }
    public void getAverageTemperature(Season sea){
        System.out.println(sea +" temperature is : "+sea.temp);
    }
}
class Eeenum2 {
    public static void main(String[] args) {
//        Season obj = Season.FALL;
        Season[] sea = Season.values();
        for (Season val : sea) {
            val.getAverageTemperature(val);
        }
    }
}

