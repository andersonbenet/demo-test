package runner;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import test.CustomerTest;

@RunWith(Categories.class)
@IncludeCategory(CustomerTest.class)
@SuiteClasses({CustomerTest.class})
public class Runner {

}
