public class BonusMilesService {
    public int calculate(int cost) {
        int tariff = 20;
        int aviaMiles = cost / tariff;
        return aviaMiles;
    }

}
