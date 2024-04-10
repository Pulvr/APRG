package Kochbuch;

public record Recipe(String name, String description) {

    @Override
    public String toString(){
        return name+": "+description;
    }
}
