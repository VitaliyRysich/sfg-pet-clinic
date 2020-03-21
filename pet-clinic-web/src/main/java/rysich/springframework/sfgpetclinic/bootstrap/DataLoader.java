package rysich.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rysich.springframework.sfgpetclinic.model.Owner;
import rysich.springframework.sfgpetclinic.model.Pet;
import rysich.springframework.sfgpetclinic.model.PetType;
import rysich.springframework.sfgpetclinic.model.Vet;
import rysich.springframework.sfgpetclinic.services.OwnerService;
import rysich.springframework.sfgpetclinic.services.PetTypeService;
import rysich.springframework.sfgpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");

        PetType savedDogPetType =  petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");

        PetType savedCatPetType =  petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("15 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("123345678");

        Pet mikesPet = new Pet();
        mikesPet.setName("Rosco");
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glennanne");
        owner2.setAddress("16 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("12324545235");

        Pet fionasPet = new Pet();
        fionasPet.setName("Just cat");
        fionasPet.setOwner(owner2);
        fionasPet.setPetType(savedCatPetType);
        fionasPet.setBirthDate(LocalDate.now());

        owner2.getPets().add(fionasPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners.....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessi");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets.....");

    }
}
