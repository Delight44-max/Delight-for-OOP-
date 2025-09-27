class Menu:
    def __init__(self, items):
        self.items = items
        self.current_index = 0

    def get_current_item(self):
        return self.items[self.current_index]

    def move_down(self):
        self.current_index = (self.current_index + 1) % len(self.items)

    def move_up(self):
        self.current_index = (self.current_index - 1) % len(self.items)

    def select(self):
      return  self.get_current_item()


    def back(self):
        return "back"

    def exit(self):
        return "Exit"

