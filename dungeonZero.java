    // Main char

import java.util.Scanner;

class Character{
        String name;
        int hp;
        int maxHp;
        int attack;
        int potion;

        void attackEnemy(Enemy target){
            target.takeDamage(attack);
            System.out.println(name + " " + "memberikan" + " " + attack + " " + "damage");
        }

        void takeDamage(int enemyAttack){
            hp = hp - enemyAttack;
        }

        void showStatus(){
            System.out.println("Sisa Hp: " + hp);
        }
    }
    // Enemy
    class Enemy{
        String name;
        int hp;
        int damage;

        void attack(Character target){
            target.takeDamage(damage);
            System.out.println(name + "Menyerang!!!");
            System.out.println("Memberikan" + " " + damage + " " + "damage");
        }

        void takeDamage(int charAttack){
            hp = hp - charAttack;

        }

        void showStatus(){
            System.out.println("Hp musuh: " + hp);
        }
    }


public class dungeonZero {
    public static void main(String[] args) {
        Character Edward = new Character();
        Edward.name = "Edward";
        Edward.hp = 100;
        Edward.maxHp = 150;
        Edward.attack = 25;
        Edward.potion = 3;

        Enemy Slime = new Enemy();
        Slime.name = "Slime";
        Slime.hp = 25;
        Slime.damage = 10;

        Enemy Goblin = new Enemy();
        Goblin.name = "Goblin";
        Goblin.hp = 50;
        Goblin.damage = 25;

        Enemy Knight = new Enemy();
        Knight.name = "Knight";
        Knight.hp = 100;
        Knight.damage = 40;

        
        Scanner input = new Scanner(System.in);

    
        System.out.println("--SELAMAT DATANG DI DUNGEON ZERO--");
        System.out.println("Nama petualang: " + Edward.name);
        System.out.println("--STAGE 1--");

        System.out.println("Kamu bertemu SLIME!!!");

        while (Edward.hp > 0 && Slime.hp > 0) {

            System.out.println("==PILIH AKSI==");
            System.out.println("[1] Serang");
            System.out.println("[2] Gunakan Potion");
            System.out.println("[3] Lihat Status");
            System.out.println("[4] Kabur");

            int isi = input.nextInt();


            if (isi == 1){
                Edward.attackEnemy(Slime);
                Slime.showStatus();
                if (Slime.hp > 0){
                    Slime.attack(Edward);
                }
            }
            else if (isi == 2){
                Edward.potion = Edward.potion - 1;
                Edward.hp = Edward.hp + 20;
            }
            else if (isi == 3){
                Edward.showStatus();
            }
            else if (isi == 4){
                Edward.hp = Edward.hp - Edward.hp;
                System.out.println("GAME OVER");
            }
          }

        System.out.println("--STAGE 2--");

        System.out.println("Kamu bertemu GOBLIN!!!");

        while (Edward.hp > 0 && Goblin.hp > 0) {

            System.out.println("==PILIH AKSI==");
            System.out.println("[1] Serang");
            System.out.println("[2] Gunakan Potion");
            System.out.println("[3] Lihat Status");
            System.out.println("[4] Kabur");

            int isi = input.nextInt();


            if (isi == 1){
                Edward.attackEnemy(Goblin);
                Goblin.showStatus();
                if (Goblin.hp > 0){
                    Goblin.attack(Edward);
                }
            }
            else if (isi == 2){
                Edward.potion = Edward.potion - 1;
                Edward.hp = Edward.hp + 20;
            }
            else if (isi == 3){
                Edward.showStatus();
            }
            else if (isi == 4){
                Edward.hp = Edward.hp - Edward.hp;
                System.out.println("GAME OVER");
            }
          }

        System.out.println("--STAGE 3--");

        System.out.println("Kamu bertemu KNIGHT!!!");

        while (Edward.hp > 0 && Knight.hp > 0) {

            System.out.println("==PILIH AKSI==");
            System.out.println("[1] Serang");
            System.out.println("[2] Gunakan Potion");
            System.out.println("[3] Lihat Status");
            System.out.println("[4] Kabur");

            int isi = input.nextInt();


            if (isi == 1){
                Edward.attackEnemy(Knight);
                Knight.showStatus();
                if (Knight.hp > 0){
                    Knight.attack(Edward);
                }
            }
            else if (isi == 2){
                Edward.potion = Edward.potion - 1;
                Edward.hp = Edward.hp + 20;
            }
            else if (isi == 3){
                Edward.showStatus();
            }
            else if (isi == 4){
                Edward.hp = Edward.hp - Edward.hp;
                System.out.println("GAME OVER");
            }
            else if (Edward.hp == 0){
                System.out.println("GAME OVER");
            }
            else if (Knight.hp == 0){
                System.out.println("SELAMAT KAMU MENANG");
            }
          }
        input.close();

        
    }
}
