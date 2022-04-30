package ejercicio15;

import javax.swing.*;

public class Menu {

        String text = "****** GESTION CINEMATOGRAFICA ******** \n"
                    +"1-NUEVO ACTOR \n"
                    +"2-BUSCAR ACTOR \n"
                    +"3-ELIMINAR ACTOR \n"
                    +"4-MODIFICAR ACTOR \n"
                    +"5-VER TODOS LOS ACTORES \n"
                    +"6- VER PELICULAS DE LOS ACTORES \n"
                    +"7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n"
                    +" 8-SALIR";

    public Integer askOption(){
        System.out.println(text);
        Integer option = Integer.parseInt(JOptionPane.showInputDialog("Type an option"));
        return option;
    }

    public void showMenu(){
        Integer userOption = 1;

        do{
            userOption =askOption();
            switch(userOption){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    userOption =askOption();
                    break;
                case 8:
                    System.out.println("program finished");
                    break;
                default:
                    System.out.println("Invalid Option");
                    userOption =askOption();
                    break;
            }
        }while(userOption<8 && userOption>1);
    }

    public static void main(String[] args) {
        Menu obj = new Menu();
        obj.showMenu();


    }

}
