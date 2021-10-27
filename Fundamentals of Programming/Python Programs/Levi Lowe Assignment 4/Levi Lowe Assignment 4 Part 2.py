scores = []

names = []

result_f = open("results.txt")

for line in result_f:
    (name, score) = line.split()
    names.append(name)
    scores.append(float(score))
        
result_f.close()

scores.sort()

names.sort()

scores.reverse()

names.reverse()

print("The top scores were:")

print(names[0])

print(scores[0])

print(names[1])

print(scores[1])

print(names[2])

print(scores[2])
    
