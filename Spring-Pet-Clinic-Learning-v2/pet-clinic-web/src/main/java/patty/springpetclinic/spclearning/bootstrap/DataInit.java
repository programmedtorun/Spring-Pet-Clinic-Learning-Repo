package patty.springpetclinic.spclearning.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import patty.springpetclinic.spclearning.model.Owner;
import patty.springpetclinic.spclearning.model.Vet;
import patty.springpetclinic.spclearning.services.OwnerService;
import patty.springpetclinic.spclearning.services.VetService;

/**
 * Created by patrickskelley on Apr, 2020
 */
// spring boot specific way to implement data - command line runner

@Component    // registered in spring context
public class DataInit implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    // any impl of these interfaces will get auto wired (tagged with @Service annotation)
    public DataInit(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    // when spring context is ready it will call this run method (so kinda like psvm)
    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Mike");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Weston");

        ownerService.save(owner2);

        System.out.println("loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("jessie");
        vet2.setLastName("porter");

        vetService.save(vet2);

        System.out.println("loaded Vets...");
    }
}
