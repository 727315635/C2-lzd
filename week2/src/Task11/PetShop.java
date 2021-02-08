package Task11;

import sun.plugin.javascript.navig.Link;

class PetShop{
    private Link pets = new Link();
    public void add(Pet pet)
    {
        this.pets.add(pet);
    }
    public void delete (Pet pet)
    {
        this.pets.removeMember(String.valueOf(pet));
    }
}
