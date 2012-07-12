# Release Notes

# 0.7.0-beta.2

- Fixed showstoppe. This is what happens when you don't do integration tests...

# 0.7.0-beta.1

- Add support for pallet 0.6 + clojure 1.2.x and pallet 0.7 + clojure 1.3+
- Default to pallet 0.7.0

# 0.7.0-alpha.2

- rename library to org.cloudhoist/hadoop (was hadoop-crate)

# 0.7.0-alpha.1

- Switch build infrastructure from maven/sonatype to lein2/clojars.

- Update doco.

# 0.6.0
- upgraded pom for pallet 0.6.1, and fixed issue with group creation.

# 0.5.1

- fixed issues with defscripts preventing configuration files from loading
  properly. Upgraded crates dependencies to 0.5.1.

- removed line that bound session to a var for testing.

- Fixed session deprecations. Tracking down bug with wiped out :phase key.

- Modified config-root, pid-root and log-root to actually become evaluated
  within stevedore script.

- changed required filesystem-layout to pallet.script.lib.

# 0.5.0

Update to pallet 0.5.0.

# 0.4.0

Initial release
