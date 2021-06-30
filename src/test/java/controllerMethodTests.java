import org.junit.jupiter.api.Test;

public class controllerMethodTests
{
    @Test
    public void testAddList()
    {
        //num = current number of indexes in accordion
        //call addListClicked()
        //assert.equals(num+1,accordion.getPanels().size()
    }

    @Test
    public void testRemoveList()
    {
        //num = current number of indexes in accordion
        //int temp = (int)Math.random()*10; //random number to remove
        //call removeListClicked(at index of temp)
        //assert.equals(temp-1,accordion.getPanels().size()
    }

    @Test
    public void testEditListTitle()
    {

    }

    @Test
    public void testImportList()
    {
        //create 3 new test files to import
        //call importFileClicked() single file
        //import first test file
        //check index of accordion increased
        //assert.equals("2001-05-07",accordion.getPanels().get(accordion.getPanels().size()))
        //import second and third test file
        //check index of accordion increased by 2
        //assert.equals("2021-06-30",accordion.getPanels().get(accordion.getPanels().size()))
    }

    @Test
    public void testAllListVisible()
    {
        //increment through all entries of accordion
        //if entry.disabled = true
            //then assert.fail()
    }

    @Test
    public void testCompleteListVisible()
    {
        //increment through all entries of accordion
        //if entry class.complete = false && entry.disabled = false
            //then assert.fail()
    }

    @Test
    public void testIncompleteListVisible()
    {
        //increment through all entries of accordion
        //if entry class.complete = true && entry.disabled = false
            //then assert.fail()
    }


}
