Based on the cljs code splitting quick start.

Build with:

``` bash
clj -M -m cljs.main -v -co build.edn -c -s
```

# Issues

- Resolved functions are not called when the modules are first loaded; you have to press the button twice to call the callback function.
- Only the first module we attempt to load is ever actually loaded.
