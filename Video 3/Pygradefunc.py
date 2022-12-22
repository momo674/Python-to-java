def grade(avg):
    '''int --> str | takes a number grade and returns number grade'''
    if avg >= 90:
        grade = 'A'
    elif avg >= 80:
        grade = 'B'
    elif avg >= 70:
        grade = 'C'
    elif avg>= 60:
        grade = 'D'
    else:
        grade = 'F'
    return grade


class Rectangle:
    def __init__(self, w, h):
        self.width = w
        self.height = h
    def area(self):
        return self.width * self.height
