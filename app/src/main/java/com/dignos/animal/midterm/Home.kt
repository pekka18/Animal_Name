package com.dignos.animal.midterm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.dignos.animal.midterm.adapters.AnimalAdapter
import com.dignos.animal.midterm.databinding.ActivityHomeBinding
import com.dignos.animal.midterm.models.Animal

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.manage.setOnClickListener {
            val intent = Intent(this, ManageBlock::class.java)
            startActivity(intent)
        }
        val animals:MutableList<Animal> =ArrayList()
        animals.add(Animal(1, "Alpaca", "The alpaca is a species of South American camelid mammal. It is similar to, and often confused with, the llama."))
        animals.add(Animal(2, "Baboon", "Baboons are primates comprising the genus Papio, one of the 23 genera of Old World monkeys, in the family Cercopithecidae."))
        animals.add(Animal(3, "Cat", "The cat, commonly referred to as the domestic cat or house cat, is the only domesticated species in the family Felidae."))
        animals.add(Animal(4, "Dog", "The dog is a domesticated descendant of the wolf. Also called the domestic dog, it is derived from extinct Pleistocene wolves"))
        animals.add(Animal(5, "Eagle", "Eagle is the common name for the golden eagle, bald eagle, and other birds of prey in the family Accipitridae."))
        animals.add(Animal(6, "Fox", "Foxes are small to medium-sized, omnivorous mammals belonging to several genera of the family Canidae."))
        animals.add(Animal(7, "Goat", "The goat or domestic goat is a domesticated species of goat-antelope typically kept as livestock."))
        animals.add(Animal(8, "Horse", "The horse is a domesticated, one-toed, hoofed mammal."))
        animals.add(Animal(9, "Iguana", "Iguana is a genus of herbivorous lizards that are native to tropical areas of Mexico, Central America, South America, and the Caribbean."))
        animals.add(Animal(10, "Jaguar", "The jaguar is a large cat species and the only living member of the genus Panthera native to the Americas. "))
        animals.add(Animal(11, "Kangaroo", "Kangaroos are four marsupials from the family Macropodidae."))
        animals.add(Animal(12, "Lion", "The lion is a large cat of the genus Panthera native to Africa and India."))
        animals.add(Animal(13, "Mouse", "A mouse is a small rodent. Characteristically, mice are known to have a pointed snout, small rounded ears, a body-length scaly tail, and a high breeding rate."))
        animals.add(Animal(14, "Narwhal", "The narwhal, also known as a narwhale, is a medium-sized toothed whale that possesses a large \"tusk\" from a protruding canine tooth."))
        animals.add(Animal(15, "Octopus", "An octopus is a soft-bodied, eight-limbed mollusc of the order Octopoda. "))
        animals.add(Animal(16, "Panda", "The giant panda, sometimes called a panda bear or simply panda, is a bear species endemic to China."))
        animals.add(Animal(17, "Quail", "Quail is a collective name for several genera of mid-sized birds generally placed in the order Galliformes."))
        animals.add(Animal(18, "Rabbit", "Rabbits, also known as bunnies or bunny rabbits, are small mammals in the family Leporidae of the order Lagomorpha."))
        animals.add(Animal(19, "Salamander", "Salamanders are a group of amphibians typically characterized by their lizard-like appearance, with slender bodies"))
        animals.add(Animal(20, "Tiger", "The tiger is the largest living cat species and a member of the genus Panthera."))
        animals.add(Animal(21, "Urchin", "Sea urchins are spiny, globular echinoderms in the class Echinoidea. "))
        animals.add(Animal(22, "Viper", "The Viperidae are a family of snakes found in most parts of the world"))
        animals.add(Animal(23, "Whale", "Whale, any of the larger species of aquatic mammals belonging to the order Cetacea."))
        animals.add(Animal(24, "Xenops", "Xenops is a genus in the bird family Furnariidae, the ovenbirds."))
        animals.add(Animal(25, "Yak", "The domestic yak, also known as the Tartary ox, grunting ox, or hairy cattle, is a species of long-haired domesticated cattle"))
        animals.add(Animal(26, "Zebra", "Zebras are African equines with distinctive black-and-white striped coats."))

        binding.animalList.layoutManager = LinearLayoutManager(this)
        binding.animalList.adapter = AnimalAdapter(
            this,
            animals
        )
    }

}