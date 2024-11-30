import io.restassured.response.ValidatableResponse;
import models.valheim.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import requestprovider.ValheimRequestProvider;
import utils.RestUtils;

import java.util.Arrays;

public class ValheimTest extends BaseTest {

    private final ValheimRequestProvider requestProvider = new ValheimRequestProvider();


    @Test
    public void ValheimTest() {
        ValidatableResponse response = RestUtils.get(requestProvider.prepareGetValheimListRequest());
        response.statusCode(200);
        ValheimResponse character = response.extract().body().as(ValheimResponse.class);
        Assertions.assertEquals(getValheimResponse(), character);
    }

    private ValheimResponse getValheimResponse() {
        return new ValheimResponse()
                .setName("Ban Kamochi")
                .setInventory(
                        new Inventory()
                                .setWeapon(
                                        Arrays.asList(
                                                new Weapon()
                                                        .setName("Club")
                                                        .setMaterial("Black metal")
                                                        .setDamage(50)
                                        )
                                )
                                .setArmor(
                                        new Armor()
                                                .setItems(Arrays.asList(
                                                                new Item()
                                                                        .setName("Helmet")
                                                                        .setMaterial("Black metal"),
                                                                new Item()
                                                                        .setName("Cuirass")
                                                                        .setMaterial("Black metal"),
                                                                new Item()
                                                                        .setName("Greaves")
                                                                        .setMaterial("Black metal"),
                                                                new Item()
                                                                        .setName("Cape")
                                                                        .setMaterial("Silk")
                                                        )
                                                )
                                                .setIsSet(true)
                                )
                                .setFood(Arrays.asList(
                                                new Food()
                                                        .setName("Blood pudding")
                                                        .setHpBonus(30)
                                                        .setStaminaBonus(30)
                                                        .setAmount(5),
                                                new Food()
                                                        .setName("Lox meat pie")
                                                        .setHpBonus(60)
                                                        .setStaminaBonus(15)
                                                        .setAmount(5)
                                        )
                                )
                                .setPotions(Arrays.asList(
                                                new Potion()
                                                        .setName("Mead Health Minor")
                                                        .setRegeneration(50)
                                                        .setDuration(10)
                                                        .setAmount(4)
                                        )
                                )
                )
                .setSkills(Arrays.asList(
                        new Skill()
                                .setName("Running")
                                .setLevel(30),
                        new Skill()
                                .setName("Block")
                                .setLevel(20),
                        new Skill()
                                .setName("Сlub")
                                .setLevel(18)
                        )
                )
                .setCreated("2020-03-16")
                .setAlive(true);
    }
}
