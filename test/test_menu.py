import unittest
from nokia_menu import  Menu
class TestMenu(unittest.TestCase):
    def test_menu_start_at_first_item(self):
        nokia_menu = Menu(["Messages", "Contacts", "Settings"])
        self.assertEqual(nokia_menu.get_current_item(), "Messages")

    def test_move_down_changes_current_item(self):
        nokia_menu = Menu(["Messages", "Contacts", "Settings"])
        nokia_menu.move_down()
        self.assertEqual(nokia_menu.get_current_item(), "Contacts")


    def test_move_down_wraps_to_first_item(self):
        nokia_menu = Menu(["Messages", "Contacts", "Settings"])
        nokia_menu.move_down()
        nokia_menu.move_down()
        nokia_menu.move_down()
        self.assertEqual(nokia_menu.get_current_item(), "Messages")

    def test_move_up_changes_current_item(self):
        nokia_menu = Menu(["Messages", "Contacts", "Settings"])
        nokia_menu.move_down()
        nokia_menu.move_up()
        self.assertEqual(nokia_menu.get_current_item(),"Messages")


    def test_move_up_wraps_to_last_item(self):
        nokia_menu = Menu(["Messages", "Contacts", "Settings"])
        nokia_menu.move_up()
        self.assertEqual(nokia_menu.get_current_item(), "Settings")


    def test_select_returns_current_item(self):
        nokia_menu = Menu(["Messages", "Contacts", "Settings"])
        self.assertEqual(nokia_menu.select(), "Messages")


    def test_select_after_moving(self):
        nokia_menu = Menu(["Messages", "Contacts", "Settings"])
        nokia_menu.move_down()
        self.assertEqual(nokia_menu.select(), "Contacts")
        nokia_menu.move_down()
        self.assertEqual(nokia_menu.select(), "Settings")

    def test_back_returns_back(self):
        nokia_menu = Menu(["Messages", "Contacts", "Settings"])
        self.assertEqual(nokia_menu.back(), "back")


    def test_exit_returns_exit(self):
        nokia_menu = Menu(["Messages", "Contacts", "Settings"])
        self.assertEqual(nokia_menu.exit(), "Exit")