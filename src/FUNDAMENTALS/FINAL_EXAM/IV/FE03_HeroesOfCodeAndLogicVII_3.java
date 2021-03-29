package FUNDAMENTALS.FINAL_EXAM.IV;

import java.util.*;

public class FE03_HeroesOfCodeAndLogicVII_3 {

    static class Heroes {
        String heroName;
        int HP;
        int MP;

        public Heroes(String heroName, int HP, int MP) {
            this.heroName = heroName;
            this.HP = HP;
            this.MP = MP;
        }

        public String getHeroName() {
            return heroName;
        }

        public int getHP() {
            return HP;
        }

        public int getMP() {
            return MP;
        }

        public void setHP(int HP) {
            this.HP = HP;
        }

        public void setMP(int MP) {
            this.MP = MP;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Heroes> heroes = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] hero = scanner.nextLine().split("\\s+");
            String name = hero[0];
            int HP = Integer.parseInt(hero[1]);
            int MP = Integer.parseInt(hero[2]);

            Heroes h = new Heroes(name, HP, MP);
            if (!heroes.containsKey(name)) {
                heroes.put(name, h);
            }
        }
        String commands = scanner.nextLine();

        while (!"End".equals(commands)) {
            String command = commands.split(" - ")[0];
            String name = commands.split(" - ")[1];
            int HP = heroes.get(name).getHP();
            int MP = heroes.get(name).getMP();

            if (heroes.containsKey(name)) {

                if (command.equals("CastSpell")) {
                    int neededMP = Integer.parseInt(commands.split(" - ")[2]);
                    String spellName = commands.split(" - ")[3];

                    if (neededMP <= MP) {
                        MP -= neededMP;
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", name, spellName, MP);
                        heroes.get(name).setMP(MP);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", name, spellName);
                    }

                } else if (command.equals("TakeDamage")) {
                    int damage = Integer.parseInt(commands.split(" - ")[2]);
                    String attacker = commands.split(" - ")[3];

                    HP -= damage;
                    if (HP > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, HP);
                        heroes.get(name).setHP(HP);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", name, attacker);
                        heroes.remove(name);
                    }

                } else if (command.equals("Recharge")) {
                    int amount = Integer.parseInt(commands.split(" - ")[2]);

                    if ((MP + amount) > 200) {
                        amount = 200 - MP;
                    }
                    heroes.get(name).setMP(MP + amount);
                    System.out.printf("%s recharged for %d MP!%n", name, amount);

                } else if (command.equals("Heal")) {
                    int amount = Integer.parseInt(commands.split(" - ")[2]);

                    if (HP + amount > 100) {
                        amount = 100 - HP;
                    }
                    heroes.get(name).setHP(HP + amount);
                    System.out.printf("%s healed for %d HP!%n", name, amount);
                }
            }

            commands = scanner.nextLine();
        }

        heroes.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().getHP(), e1.getValue().getHP()))
                .forEach(entry -> System.out.printf("%s%n HP: %d%n MP: %d%n", entry.getKey(), entry.getValue().getHP(), entry.getValue().getMP()));

    }
}
