public abstract class Dog implements IMove {
    int position;
    int averageLength;

    public abstract void describe();

    Dog(int position, int averageLength){
        this.position = position;
        this.averageLength = averageLength;
    }
}

class Pitbull extends Dog {
    Pitbull(int position, int averageLength){
        super(position, averageLength);
    }

    public void move() {
        position += 3;
        System.out.println("Pitbull Position : " + position);
    }

    public void describe(){
        System.out.println("Anjing pit bull dikenal sebagai anjing yang penuh energi dan cerdas");
    }
}

class SiberianHusky extends Dog {
    SiberianHusky(int position, int averageLength){
        super(position, averageLength);
    }

    public void move() {
        position += 2;
        System.out.println("SiberianHusky Position : " + position);
    }

    public void describe(){
        System.out.println("Siberian husky adalah anjing yang kuat, berukuran sedang, memiliki bulu tebal untuk menahan suhu dingin yang ekstrem");
    }
}

class Bulldog extends Dog {
    Bulldog(int position, int averageLength){
        super(position, averageLength);
    }

    public void move() {
        position += 1;
        System.out.println("Bulldog Position (" + position + ")");
    }

    public void describe(){
        System.out.println("Bulldog adalah salah satu anjing ras tertua di dunia yang berasal dari Inggris");
    }
}

class GermanShepherd extends Dog {
    GermanShepherd(int position, int averageLength){
        super(position, averageLength);
    }

    public void move() {
        position += 3;
        System.out.println("GermanShepherd Position : " + position);
    }

    public void describe(){
        System.out.println("German Shepherd kerap kali dijadikan sebagai anjing polisi, hal ini dikarenakan posturnya yang tegap dan gerakannya yang lincah");                  
    }
}





