def primes(n):
    primfac = []
    d = 2
    while d*d <= n:
        while (n % d) == 0:
            primfac.append(d)  # supposing you want multiple factors repeated
            n //= d
        d += 1
    if n > 1:
       primfac.append(n)
    print primfac
    return primfac

def primeFactors(n):
    ls = {
      2: 0, 
      3: 0, 
      5: 0, 
      7: 0, 
      11: 0, 
      13: 0, 
      17: 0, 
      19: 0, 
      23: 0, 
      29: 0, 
      31: 0, 
      37: 0, 
      41: 0, 
      43: 0, 
      47: 0,
      }
    a = primes(n)
    f = []
    for i in a:
        try:
            ls[i] += 1
        except:
            ls[i] = 1
    for i in a:
        if ls[i] == 1:
            f.append('(' + str(i) + ')')
        elif str('(' + str(i) + '**' + str(ls[i]) + ')') not in f:
            f.append('(' + str(i) + '**' + str(ls[i]) + ')')
    return ''.join(f)