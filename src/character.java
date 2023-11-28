public class character {
    String name;
    double hp;
    int mana;
    int level;
    double speed;
    String weapon1;
    String weapon2;

    double baseRunSpeed = 2.0;
    int swordBaseDamage = 10;
    int shieldBaseDefense = 5;

    character( String name,int level,String weapon1,String weapon2){
        this.name = name;
        this.hp = 100+10*level;
        this.mana = 50+2*level;
        this.level = level;
        this.weapon1 = weapon1;
        this.weapon2 = weapon2;

        if(weapon1.equals("sword") && weapon2.equals("")){
            speed = baseRunSpeed*(0.1+0.04*level);
        } else if (weapon1.equals("shield") && weapon2.equals("")) {
            speed = baseRunSpeed*(0.1+0.08*level);
        } else if (weapon1.equals("sword") && weapon2.equals("shield")) {
            speed = (baseRunSpeed*(0.1+0.04*level))+(baseRunSpeed*(0.1+0.08*level));
        } else {
            speed = baseRunSpeed*(0.1+0.03*level);
        }

    }

    public void attack(character attacker/*ผูู้ถููกโจมตี*/){

        if(attacker.weapon1.equals("shield")||attacker.weapon2.equals("shield")){
            attacker.hp = attacker.hp-5;
        }else {
            attacker.hp = attacker.hp- swordBaseDamage;
        }
    }

    public void levelUp(character winner){
        if(winner.hp>0){
            winner.level = level+1;
        }
    }

    public void showValue(){
        System.out.println("name : "+name);
        System.out.println("hp : "+hp);
        System.out.println("mana : "+mana);
        System.out.println("level : "+level);
        System.out.println("speed : "+speed);


        if(weapon1.equals("sword") && weapon2.equals("shield")){
            System.out.println("weapon1 : "+weapon1);
            System.out.println("weapon2 : "+weapon2);
        } else if (weapon1.equals("sword") && weapon2.equals("")) {
            System.out.println("weapon1 : "+weapon1);
            System.out.println("weapon2 : NO WEAPON");
        } else if (weapon1.equals("shield") && weapon2.equals("")) {
            System.out.println("weapon1 : "+weapon1);
            System.out.println("weapon2 : NO WEAPON");
        } else if (weapon1.equals("") && weapon2.equals("")) {
            System.out.println("weapon1 : NO WEAPON");
            System.out.println("weapon2 : NO WEAPON");
        }
    }

    }