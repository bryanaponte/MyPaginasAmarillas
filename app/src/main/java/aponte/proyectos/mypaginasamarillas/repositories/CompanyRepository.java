package aponte.proyectos.mypaginasamarillas.repositories;

import java.util.ArrayList;
import java.util.List;

import aponte.proyectos.mypaginasamarillas.models.Company;

public class CompanyRepository {
    private static List<Company> companies = new ArrayList<>();

    static {
        companies.add( new Company(100, "PizzaHut", "Pizza Hut es una cadena de restaurantes de comida rápida subsidiaria del grupo Yum!", "jockey plaza",545400,"restaurant","pizzaHut.com","www.pizza.com","pizza") );
        companies.add( new Company(200, "Toyota", "es una compañía de fabricación de automóviles japonesa.", "javier prado",48200,"mecanica","toyota.com","www.toyota.com","toyota") );
        companies.add( new Company(300, "Britanico", "es una asociación cultural binacional con fines de lucro que brinda la enseñanza del idioma inglés británico", "UNIFE",48200,"estudios","britanico.com","www.britanico.com","britanico") );
        companies.add( new Company(400, "Ipcna", " es el centro cultural binacional para la enseñanza del idioma inglés estadounidense", "San Borja",564436,"estudios","ipcna.com","www.ipcna.com","ipcna") );
        companies.add( new Company(500, "KFC", "Kentucky Fried Chicken, más conocido por sus siglas KFC, es una franquicia de restaurantes de comida rápida especializada en pollo frito", "Santa anita",646646,"restaurant","kfc.com","www.kfc.com","kfc") );
        companies.add( new Company(600, "PizzaHut", "Pizza Hut es una cadena de restaurantes de comida rápida subsidiaria del grupo Yum!", "jockey plaza",545400,"restaurant","pizzaHut.com","www.pizza.com","pizza") );
        companies.add( new Company(700, "Toyota", "es una compañía de fabricación de automóviles japonesa.", "javier prado",48200,"mecanica","toyota.com","www.toyota.com","toyota") );
        companies.add( new Company(800, "Britanico", "es una asociación cultural binacional con fines de lucro que brinda la enseñanza del idioma inglés británico", "UNIFE",48200,"estudios","britanico.com","www.britanico.com","britanico") );
        companies.add( new Company(900, "Ipcna", " es el centro cultural binacional para la enseñanza del idioma inglés estadounidense", "San Borja",564436,"estudios","ipcna.com","www.ipcna.com","ipcna") );
        companies.add( new Company(500, "KFC", "Kentucky Fried Chicken, más conocido por sus siglas KFC, es una franquicia de restaurantes de comida rápida especializada en pollo frito", "Santa anita",646646,"restaurant","kfc.com","www.kfc.com","kfc") );
    }

    public static List<Company> getCompanies() {
        return companies;

    }
    public static Company getCompanyByid(Integer id){
        for (Company company: companies) {
            if(company.getId().equals(id)) {
                return company;
            }
        }
        return null;
    }
}

