import unittest
from src.someclass import someClass

class test_someclass(unittest.TestCase):

    def test_isAThingThatCouldGoHere(self):
        someclass = someClass()
        expected = "Foo"
        actual = someClass.someMethod(someclass)
        self.assertEqual(expected, actual)
