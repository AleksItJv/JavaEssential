package homework7.task3;

enum Animals {
    BULL(10){
        @Override
        public String toString(){
            return super.toString() + " year";
        }
    }, JAK(5), BIZONE(25);
    int year;

    Animals(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    @Override
    public String toString() {
        return "Animal " + super.toString() +
                ", year = " + this.year;
    }
}
