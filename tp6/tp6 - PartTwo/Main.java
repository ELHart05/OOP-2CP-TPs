public class Main {

    public static void main(String[] args) {

        String logo = "https://www.esi-sba.dz/fr/wp-content/uploads/2020/10/Logo-Complet-ESI-SBA-200mm-x-200mm_couleur-500x500.png";
        Institution ESI = new Institution(0, "Ecole Superieur", "SBA", "+21356982456", logo);

        Department Prepa = new Department(0, "Cycle Preparatoire", "CPI", "Aced", "prepa@esi-sba.dz");
        Prepa.print_department_infos();
        Department Sup = new Department(1, "Cycle Superieur", "CS", "Amrane", "sup@esi-sba.dz");
        Sup.print_department_infos();

        ESI.print_institution_infos();

        ServicePayment PrepaSPayment = new ServicePayment(0, 1200);
        Prepa.setDeparmentSPayment(PrepaSPayment);
        ServiceRH PrepaSRH = new ServiceRH(0, "Creativity, Leadership");
        Prepa.setDeparmentSRH(PrepaSRH);
        ServiceTeaching prepaServiceTeaching = new ServiceTeaching("All Days Except Weekend", "Omar, Ahmed, Okba....",
                "07-09-2022", "06-06-2023");
        Prepa.setDeparmentSTeaching(prepaServiceTeaching);

        Department[] ESIDepartments = { Prepa, Sup };
        ESI.setDepartments(ESIDepartments);

        Block BA1 = new Block("B Alpha 1", "Near Labri ESI SBA", "white");
        Block BA2 = new Block("B Alpha 2", "Near Labri ESI SBA", "gray");

        Block[] PrepaBlocks = { BA1, BA2 };
        Prepa.setBlocks(PrepaBlocks);

        Block BP1 = new Block("B Sup", "Near FAC Technologie", "white");

        Block[] SupBlocks = { BP1 };
        Sup.setBlocks(SupBlocks);

        Amphitheater AmphiA = new Amphitheater(0, "Amphi A", 15, 300, true);
        AmphiA.print_amphitheatre_infos();
        Amphitheater AmphiB = new Amphitheater(1, "Amphi B", 9, 150, false);
        AmphiB.print_amphitheatre_infos();
        Bureau AcedBureau = new Bureau(0, "Prepa Administration", 5, 10, "Mr Aced Office");
        AcedBureau.print_bureau_infos();
        TP_Salle Salle1 = new TP_Salle(0, "Salle TP 1", 7, 40, "Rallange", false);
        Salle1.print_salleTP_infos();

        Building[] BA1Buildings = { AmphiA, AmphiB, AcedBureau, Salle1 };
        BA1.setBuildings(BA1Buildings);

        PC HP1 = new PC(0, "15496", "18-10-2022", "I7", "16");
        PC HP2 = new PC(1, "15497", "20-10-2022", "I9", "32");
        PC HP3 = new PC(2, "15498", "22-10-2022", "I5", "16");
        Datashow Toshiba = new Datashow(0, "9456", "01-02-2023", "TOSHIBA");
        Printer Canoon = new Printer(0, "54246", "02-02-2023", "Canoon", 3);
        Accessoire Keyboard = new Accessoire(0, "656", "15-03-2023", "Clavier Gamer");

        Materials[] Salle1Materials = { HP1, HP2, HP3, Toshiba, Canoon, Keyboard };
        Salle1.setMaterials(Salle1Materials);
    }

}