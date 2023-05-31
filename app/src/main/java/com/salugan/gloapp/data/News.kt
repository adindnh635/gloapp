package com.salugan.gloapp.data

data class News(
    val title: String,
    val publishedAt: String,
    val urlToImage: String,
    val url: String,
)

val newsData = arrayListOf(
    News(
        "ELLE Edit: 20 Moisturisers To Try If You Have Acne-Prone Skin",
        "30 MAY 2023",
        "https://hips.hearstapps.com/hmg-prod/images/moisturisers-for-acne-prone-skin-646f1c999e535.jpg?crop=1.00xw:1.00xh;0,0&resize=1200:*",
        "https://www.elle.com/uk/beauty/skin/articles/g31454/face-cream-and-moisturisers-for-oily-skin/"
    ),
    News(
        "The Very Best Bronzers For A Totally Believable Sun-Kissed Glow",
        "30 MAY 2023",
        "https://hips.hearstapps.com/hmg-prod/images/best-bronzer-6470ca51d1cb4.jpg?crop=1.00xw:1.00xh;0,0&resize=1200:*",
        "https://www.elle.com/uk/beauty/make-up/g31705/best-bronzer/"
    ),
    News(
        "ELLE Lab: 10 Best Vegan Moisturisers To Add To Your Skincare Routine",
        "25 MAY 2023",
        "https://hips.hearstapps.com/hmg-prod/images/beauty-elle-vegan-skincare-646f50624a688.png?crop=1.00xw:1.00xh;0,0&resize=1200:*",
        "https://www.elle.com/uk/beauty/skin/g36554847/best-vegan-skincare/"
    ),
    News(
        "ELLE Lab: The Best Epilators For Salon-Worthy Smooth Skin",
        "25 MAY 2023",
        "https://hips.hearstapps.com/hmg-prod/images/epilators-banner-image-646decb271342.png?crop=1.00xw:1.00xh;0,0&resize=1200:*",
        "https://www.elle.com/uk/beauty/body-and-physical-health/g32328342/best-epilators/"
    ),
    News(
        "The 17 Best Anti-Frizz Hair Products We've Ever Tried",
        "23 MAY 2023",
        "https://hips.hearstapps.com/hmg-prod/images/frizzy-hair-products-646c841f8f9f5.jpg?crop=1.00xw:1.00xh;0,0&resize=1200:*",
        "https://www.elle.com/uk/beauty/hair/g11222/elle-beauty-edit-the-best-anti-frizz-hair-products-to-use-for-hair-in-humidity/"
    ),
    News(
        "The Best Volumising Shampoos For Fine, Flat Hai",
        "23 MAY 2023",
        "https://hips.hearstapps.com/hmg-prod/images/best-shampoo-fine-hair-646ca4ee74db0.jpg?crop=0.5023255813953489xw:1xh;center,top&resize=1200:*",
        "https://www.elle.com/uk/beauty/hair/a22130/product-review-volumising-shampoos-and-conditioners/"
    )
)