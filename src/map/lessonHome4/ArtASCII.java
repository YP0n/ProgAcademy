package map.lessonHome4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArtASCII {
    private Map<Character, String[]> map = new HashMap<>();

    public ArtASCII() {
        super();
        addASCII();
    }

    private void addASCII() {
        String[] a = new String[]{"     *     ", "    * *    ", "   *   *   ", "  *******  ", " *       * ",
                "*         * "};
        String[] b = new String[]{"********** ", "*        * ", "*        * ", "********** ", "*        * ",
                "***********"};
        String[] c = new String[]{"***********", "*          ", "*          ", "*          ", "*          ",
                "***********"};
        String[] d = new String[]{"********** ", "*        * ", "*         *", "*         *", "*        * ",
                "********** "};
        String[] e = new String[]{"***********", "*          ", "*          ", "***********", "*          ",
                "***********"};
        String[] f = new String[]{"***********", "*          ", "*          ", "***********", "*          ",
                "*          "};
        String[] g = new String[]{"***********", "*          ", "*          ", "*       ***", "*         *",
                "***********"};
        String[] h = new String[]{"*         *", "*         *", "***********", "*         *", "*         *",
                "*         *"};
        String[] i = new String[]{"    ***    ", "     *     ", "     *     ", "     *     ", "     *     ",
                "    ***    "};
        String[] j = new String[]{"***********", "     *     ", "     *     ", "     *     ", "    *      ",
                "****       "};
        String[] k = new String[]{"*        **", "*       *  ", "*     *    ", "** * *     ", "*      *   ",
                "*       ***"};
        String[] l = new String[]{"*          ", "*          ", "*          ", "*          ", "*          ",
                "*********  "};
        String[] m = new String[]{"*         *", "*         *", "* *     * *", "*  *   *  *", "*    *    *",
                "*         *"};
        String[] n = new String[]{"*         *", "**        *", "* *       *", "*   *     *", "*     *   *",
                "*      ****"};
        String[] o = new String[]{"***********", "*         *", "*         *", "*         *", "*         *",
                "***********"};
        String[] p = new String[]{"***********", "*         *", "*         *", "***********", "*          ",
                "*          "};
        String[] r = new String[]{"********** ", "*         *", "*         *", "********** ", "      **   ",
                "        ***"};
        String[] q = new String[]{"***********", "*         *", "*         *", "*     *   *", "***********",
                "        *  "};
        String[] s = new String[]{"       *** ", "*          ", "**         ", "  *****    ", "       *   ",
                "*******    "};
        String[] t = new String[]{"***********", "     *     ", "     *     ", "     *     ", "     *     ",
                "     *     "};
        String[] u = new String[]{"*         *", "*         *", "*         *", "*         *", "*         *",
                "***********"};
        String[] v = new String[]{"*         *", " *       * ", "  *     *  ", "   *   *   ", "    * *    ",
                "     *     "};
        String[] w = new String[]{"*         *", "*         *", "*         *", "**   *    *", "  * *  * * ",
                "   **  **  "};
        String[] x = new String[]{"*         *", " *       * ", "  *******  ", "  *     *  ", " *       * ",
                "*         *"};
        String[] y = new String[]{"*         *", " *        *", "  *      * ", "    *****  ", "        *  ",
                "********   "};
        String[] z = new String[]{"***********", "          *", "         * ", " ********  ", "*          ",
                "***********"};

        map.put('a', a);
        map.put('b', b);
        map.put('c', c);
        map.put('d', d);
        map.put('e', e);
        map.put('f', f);
        map.put('g', g);
        map.put('h', h);
        map.put('i', i);
        map.put('j', j);
        map.put('k', k);
        map.put('l', l);
        map.put('m', m);
        map.put('n', n);
        map.put('o', o);
        map.put('p', p);
        map.put('r', r);
        map.put('q', q);
        map.put('s', s);
        map.put('t', t);
        map.put('u', u);
        map.put('v', v);
        map.put('w', w);
        map.put('x', x);
        map.put('y', y);
        map.put('z', z);
    }

    public Map<Character, String[]> getMap() {
        return map;
    }

    public void setMap(Map<Character, String[]> map) {
        this.map = map;
    }
}
