package TrabajoPracticoNro6;

import java.util.Random;

public class Contraseñas
{
    private static Random r = new Random();

    private int longitud=0;
    private String password="";

    public Contraseñas(int longitud) {
        this.longitud = longitud;
        CrearContraseña();
    }

    private int contMayus=0;
    private int contMinus=0;
    private int contNums=0;

    public void CrearContraseña() {
        for (int i=0;i<this.longitud;i++) {
            int x = (int)(Math.random()*3); //se genera un numero random que determina que tipo de elemnto se agregara a la contraseña

            switch (x) {
                case 0: {
                    password += ((char)(r.nextInt(25)+65));
                    contMayus++;
                    break;
                }
                case 1: {
                    password += ((char)(r.nextInt(25)+97));
                    contMinus++;
                    break;
                }
                case 2: {
                    password += ((int)(r.nextInt(9)));
                    contNums++;
                    break;
                }
                default: break;
            }
        }
    }

    public void Seguridad()
    {
        if (this.longitud>=11) {
            if (contNums>5 && contMinus>1 && contMayus>2) {
                System.out.println ("La contraseña creada es segura.");
            }
            else {
                System.out.println ("La contraseña creada es debil.");
            }
        }
        else {
            System.out.println ("La contraseña creada es debil.");
        }
    }


    //metodos get
    public int getLongitud() {
        return longitud;
    }

    public String getPassword() {
        return password;
    }
}
