package com.foodRecipe.recipeBook.util;

public class Constant {

    public static final String SECRET_KEY = System.getenv("secret_key");
    public static final String EDAMAM_APP_ID = System.getenv("edaman_app_id");
    public static final String EDAMAM_APP_KEY = System.getenv("edaman_app_key");
    public static final String GET_SAMPLE_RECIPES_RESPONSE = """
                                                            [
                                                              {
                                                                "id": null,
                                                                "label": "The Ultimate Burger",
                                                                "imageUrl": "https://edamam-product-images.s3.amazonaws.com/web-img/05f/05f6b1fbd22e92e2f7ba32026abe1714.jpg?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEFQaCXVzLWVhc3QtMSJGMEQCIG2Z4x1qFiCEUcKkRfGmoKt41XgHU9ZkclNTBDe41GDOAiBTzBMCuFLKtY46dqw7ZORAw7cIoeVRmZGo2ho%2BkPWTrCq5BQg9EAAaDDE4NzAxNzE1MDk4NiIMUgolFus291X7CTQtKpYF1T%2FdpbY0DixJa8H9%2FLgF1OFvB1aFjXyoPMoXwqpv1cG6yIKqUy2g5xo9mL9NuqjiUwRHC09q6o5QvddA16aOhM2CUx5oxVCW2h10GcuhD81MVm8xuEcgPd27diDNZqKjhusPxsdmR0R6PeUt3oxWWRhaDHIk%2BT8EXcvp9654oLQYPHS9szkz%2BaLYgtahkZZANBZzbMcuRFfix2cTjMYXJO81hKCKR3Ne%2BFSwyqfVNqYJcmzj1LoxxVNvBtZfCS2uVluxAdn9rliF7IhUG9S69K4aIwycD5%2FuXSMxAN%2F9Yen4loHOO7ISF5cOaQmrijJbVMvw51npN6IsRj%2F9tYDeMpN0qVbbi3rCBEpSVh4xcjJI60BmeCNMtVIcfUMUpfV0CpNuP3c2SAjxsrSMNDPCLbV%2BHlY4Ek3XVRUFN1Uts0UNT4d%2BihVnPOUwVOHYLPL5xDnWqAyOzrsogoTkvpnsy08P%2BEuMlYL9v5%2FtHApIbgjc1xx7a3lHkAggbMcKb%2Bcy40RNe1%2FffedVNT1UhKE1R8le7FLCXpaISNMzxJjUCL3PrARwGAfFlO7tv8y7URThLidmIo32cN5G6RE00khcxDFzNbZETHUGBuKsmqKHH5SPR8Ur%2F3%2FtIRLFxlCpumoSL%2FMS%2BHP69kr6wyIPFYdLrdFrlOstJncrk3Az%2BRIA1xyUM8Gyd%2BDs0jXtfMhMeMyragUfxxCNwYYTPIap%2F0gaJ0f1UC6Ik7zkB1BWoagLhDNJLoci02fX%2BCm2bZQfnqf65ZLUGsIDiQH36q5i1Znhz%2BJ5v2Wk5WAxIN6pTGwc9y2tQb5%2FydIgBSNO99r%2Bkdorj12ZXzponUvCdnk%2B2Tf2PSNZowSUsPYZUh2lZGQYeXZU9Wz3wKQwrZ2%2BoQY6sgHLunu69U7q89ydDKMCUaH8CsJ3uIcXpe5DiCySUm8uohwjtPWZ4CM4RF1H7yHu6%2FaTafe1cxhVCVHfJVAIqidkm3D%2FtFJ12d7kHy0szm6GEDUeDKbqm6k4dI84VyKSXbCCzBGPBuRyK0psHwWtMYlLKbwFEVM2V2WRHQprn6YHbS0%2BqhJ57RGovAeU1KIsNqXNzSmxGU5xPMx6v03nftzLh2%2FiIu8jpyvFKeQuP5SZF60K&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20230407T045828Z&X-Amz-SignedHeaders=host&X-Amz-Expires=3600&X-Amz-Credential=ASIASXCYXIIFK25FO45J%2F20230407%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=4333cc1bedfc6dbce88ec53c72c820c17a9a45d63f24a40b1d97400a432bf2ff",
                                                                "servings": 6,
                                                                "totalTime": 0,
                                                                "calories": 2211.26280375,
                                                                "caloriesPerServings": 368.54380062499996,
                                                                "ingredients": [
                                                                  {
                                                                    "id": null,
                                                                    "text": "2 1/2 pounds skirt steak or sirloin flap steak",
                                                                    "quantity": 2.5,
                                                                    "measure": "pound",
                                                                    "foodId": "food_agvdl6pajjrz8sbghz0cdaz6q4yf",
                                                                    "imageUrl": "https://www.edamam.com/food-img/e1d/e1dc9aaf420f55f30dd24768e532594a.jpg",
                                                                    "food": "flap steak"
                                                                  },
                                                                  {
                                                                    "id": null,
                                                                    "text": "Accompaniments: homemade burger buns ; homemade ketchup ; homemade mustard ; homemade pickle relish ; lettuce and tomato",
                                                                    "quantity": 1,
                                                                    "measure": "burger",
                                                                    "foodId": "food_au7jthtab0n3era9uue8pauakroe",
                                                                    "imageUrl": "https://www.edamam.com/food-img/257/257207c446011b849001ae596390341c.jpeg",
                                                                    "food": "ketchup"
                                                                  }
                                                                ],
                                                                "source": "Epicurious",
                                                                "url": "https://www.epicurious.com/recipes/food/views/the-ultimate-burger-353654"
                                                              }
                                                            ]
                                                            """;
}
