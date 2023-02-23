import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void positiveChecking() {
        String str = "Норм Нормов";
        Account account = new Account(str);
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void twoCharsChecking() {
        String str = "Нв";
        Account account = new Account(str);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void treeCharsChecking() {
        String str = "Н В";
        Account account = new Account(str);
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void nineteenCharsChecking() {
        String str = "Антонио Сакашвивили";
        Account account = new Account(str);
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void twentyCharsChecking() {
        String str = "Антониан Сакашвивили";
        Account account = new Account(str);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void nullStringChecking() {
        String str = "";
        Account account = new Account(str);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void noSpaseChecking() {
        String str = "ИванЛоев";
        Account account = new Account(str);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void twoSpaseChecking() {
        String str = "Иван  Лоев";
        Account account = new Account(str);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void startSpaseChecking() {
        String str = " ИванЛоев";
        Account account = new Account(str);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void endSpaseChecking() {
        String str = "ИванЛоев ";
        Account account = new Account(str);
        Assert.assertFalse(account.checkNameToEmboss());
    }
}
